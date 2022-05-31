select activity_date day, count(distinct user_id) active_users
from activity
where activity_date <= '2019-07-27'
and datediff(dd, activity_date, '2019-07-27') < 30
group by activity_date