
select distinct num consecutivenums
from logs a
where num = (select num from logs where a.id = id+1)
and num = (select num from logs where a.id = id+2)