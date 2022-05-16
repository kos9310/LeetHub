select name, sum(amount) balance
from users a, transactions b
where a.account = b.account
group by a.account
having sum(amount) >= 10000