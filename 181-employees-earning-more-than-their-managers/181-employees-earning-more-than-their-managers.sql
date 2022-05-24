select name employee
from employee a
where salary > (select salary from employee where id = a.managerId)