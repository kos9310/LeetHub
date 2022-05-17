select id, 
	sum(case when month = 'jan' then revenue else null end) as jan_revenue,
	sum(case when month = 'feb' then revenue else null end) as feb_revenue,
	sum(case when month = 'mar' then revenue else null end) as mar_revenue,
	sum(case when month = 'apr' then revenue else null end) as apr_revenue,
	sum(case when month = 'may' then revenue else null end) as may_revenue,
	sum(case when month = 'jun' then revenue else null end) as jun_revenue,
	sum(case when month = 'jul' then revenue else null end) as jul_revenue,
	sum(case when month = 'aug' then revenue else null end) as aug_revenue,
	sum(case when month = 'sep' then revenue else null end) as sep_revenue,
	sum(case when month = 'oct' then revenue else null end) as oct_revenue,
	sum(case when month = 'nov' then revenue else null end) as nov_revenue,
	sum(case when month = 'dec' then revenue else null end) as dec_revenue
from department
group by id
order by id