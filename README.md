# Java
Java Assigment 
use alfresco;

create temporary table icog.password_hash SELECT anp2.string_value user_id, anp1.string_value password FROM alf_node_properties anp1 INNER JOIN alf_qname aq1 ON aq1.id = anp1.qname_id INNER JOIN alf_node_properties anp2 ON anp2.node_id = anp1.node_id INNER JOIN alf_qname aq2 ON aq2.id = anp2.qname_id WHERE aq1.local_name = 'password' AND aq2.local_name  = 'username';

use icog;

alter table user_data add column password varchar(100) default null;

update user_data u join password_hash ph on ph.user_id=u.user_id set u.password=ph.password;

CREATE TABLE `loginkeys` (
  `public` text,
  `private` text,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);
update group_type_m set reference_api='/user/share/group/listByCompany' where id=-1;

alter table user_data add column updated_at timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP;

alter table userdetails add column updated_at timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP;

alter table competencydemand add column search_time bigint(14);

alter table timespent add column updated_at timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP;
