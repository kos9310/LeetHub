select name
from salesperson
where sales_id not in (select c.sales_id
                        from company b, orders c
                        where b.com_id = c.com_id
                        and name = 'RED')
