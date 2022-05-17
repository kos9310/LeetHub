with aa as (select name, ifnull(sum(distance), 0) travelled_distance
from users a left join rides b
on a.id=b.user_id
group by user_id)
select *
from aa
order by travelled_distance desc, name
