with aa as (
select *, row_number() over(order by id) rn
from logs a
where num = (select num from logs where id = a.id-1)
), bb as
(
SELECT id, num, id-rn as diff
from aa
)
select distinct num consecutivenums
from bb
WHERE diff in (select diff from bb
group by diff
having count(diff) >= 2)