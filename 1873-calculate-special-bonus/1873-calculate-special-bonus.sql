select employee_id, case when employee_id%2 = 0 then 0 when instr(name, 'M') = 1 then 0 else salary end bonus
from employees