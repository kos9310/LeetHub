CREATE FUNCTION getNthHighestSalary(@N INT) RETURNS INT AS
BEGIN
    RETURN (
        select top 1 salary
        from (select salary, dense_rank() over(order by salary desc) rank
        from employee) as ss
        where rank = @N
    );
END