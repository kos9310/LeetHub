select b.name as department, a.name as employee, a.salary 
from employee a, department b
where a.departmentid = b.id
and (departmentid, salary) in (select departmentid, max(salary)
                              from employee 
                              group by departmentid)