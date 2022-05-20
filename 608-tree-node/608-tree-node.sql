select id, 'Root' type
from tree
where p_id is null
union all
select id, 'Inner' type
from tree
where p_id is not null
and id in (select distinct p_id from tree where p_id is not null)
union all
select id, 'Leaf' type
from tree
where p_id is not null
and id not in (select distinct p_id from tree where p_id is not null)