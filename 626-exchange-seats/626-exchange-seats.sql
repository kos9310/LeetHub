select id+1 id, student
from seat
where id % 2 = 1
and id <> (select max(id) from seat)
union all
select id-1 id, student
from seat
where id % 2 = 0
union all
select id, student
from seat
where id % 2 = 1
and id = (select max(id) from seat)
order by id
