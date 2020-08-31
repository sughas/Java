contain java code


//select distinct ue.`value` EmployeeNo , concat(ud.firstname ,' ' ,ud.lastname ) EmployeeName from user_data ud ,user_extra ue,privilege_scope ps where ud.user_id = ue.user_id and ps.user_id=ud.user_id and company_id=? and `key`='EmployeeId' and ud.status = 'activated' and ud.ldapuser = 'true'and ps.privilege_id is not null;

//select ud.user_id Staff_Id,concat(ud.firstname ,' ',ud.lastname ) Emp_Name ,ud.email Email_Id,CONCAT('[',group_concat( CONCAT('{Role_Id:\"', ps.privilege_id, '\", Role_Name:\"',ipm.name,'\"}')),']') Roles ,ud.created_at Date_Created ,ud.updated_at Date_Updated from user_data ud left join privilege_scope ps on (ud.user_id = ps.user_id ) left join icog_privilege_m ipm on (ps.privilege_id = ipm.privilege_id) where ud.ldapuser = 'true' and ud.status='activated' and ps.privilege_id is not null group  by ud.user_id;


