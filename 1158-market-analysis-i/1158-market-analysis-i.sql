select user_id buyer_id, join_date, ifnull(count(order_date), 0) orders_in_2019
from users a left join orders
on user_id = buyer_id
and year(order_date) = '2019'
group by user_id