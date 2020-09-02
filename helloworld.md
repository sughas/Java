contain java code


//final UL

select distinct ue.`value` EmployeeNo , concat(ud.firstname ,' ' ,ud.lastname ) EmployeeName from user_data ud ,user_extra ue,privilege_scope ps where ud.user_id = ue.user_id and ps.user_id=ud.user_id and company_id=1000 and `key`='EmployeeId' and ud.status = 'activated' and ud.ldapuser = 'true'and ps.privilege_id is not null

//final reconReport

select ud.user_id Staff_Id,concat(ud.firstname ,' ',ud.lastname ) Emp_Name ,ud.email Email_Id,CONCAT('[',group_concat( CONCAT('{Role_Id:"', ps.privilege_id, '", Role_Name:"',ipm.name,'"}')),']') Roles ,ud.created_at Date_Created ,ud.updated_at Date_Updated from user_data ud left join privilege_scope ps on (ud.user_id = ps.user_id ) left join icog_privilege_m ipm on (ps.privilege_id = ipm.privilege_id) where ud.company_id =1000 and ud.status <> 'deleted'  and ud.status= 'activated' and ud.ldapuser = 'true' and ps.privilege_id is not null group  by ud.user_id

//Emplyoee wise active role

 select ud.user_id Staff_Id,concat(ud.firstname ,' ',ud.lastname ) Emp_Name ,ud.email Email_Id,CONCAT('[',group_concat( CONCAT('{Role_Id:"', ps.privilege_id, '", Role_Name:"',ipm.name,'"}')),']') Roles ,ud.created_at Date_Created ,ud.updated_at Date_Updated  from user_data ud left join privilege_scope ps on (ud.user_id = ps.user_id ) left join icog_privilege_m ipm on (ps.privilege_id = ipm.privilege_id) where ud.status = 'activated' and ldapuser = 'true' and company_id = 1000 and ud.status <> 'deleted'  and ud.user_id = 'c-sapmleid4'and ps.privilege_id is not null  group  by ud.user_id


//Emplyooe wise role

select ud.user_id Staff_Id,concat(ud.firstname ,' ',ud.lastname ) Emp_Name ,ud.email Email_Id,CONCAT('[',group_concat( CONCAT('{Role_Id:"', ps.privilege_id, '", Role_Name:"',ipm.name,'"}')),']') Roles ,ud.created_at Date_Created ,ud.updated_at Date_Updated from user_data ud left join privilege_scope ps on (ud.user_id = ps.user_id ) left join icog_privilege_m ipm on (ps.privilege_id = ipm.privilege_id) where ud.company_id =1000 and ud.status <> 'deleted'  and ud.user_id = 'user3318' and ud.ldapuser = 'true' and ps.privilege_id is not null group  by ud.user_id



