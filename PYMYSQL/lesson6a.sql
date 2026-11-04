SELECT
    [ALL | DISTINCT | DISTINCTROW ]
    [HIGH_PRIORITY]
    [STRAIGHT_JOIN]
    [SQL_SMALL_RESULT] [SQL_BIG_RESULT] [SQL_BUFFER_RESULT]
    [SQL_NO_CACHE] [SQL_CALC_FOUND_ROWS]
    select_expr [, select_expr] ...
    [into_option]
    [FROM table_references
      [PARTITION partition_list]]
    [WHERE where_condition]
    [GROUP BY {col_name | expr | position}, ... [WITH ROLLUP]]
    [HAVING where_condition]
    [WINDOW window_name AS (window_spec)
        [, window_name AS (window_spec)] ...]
    [ORDER BY {col_name | expr | position}
      [ASC | DESC], ... [WITH ROLLUP]]
    [LIMIT {[offset,] row_count | row_count OFFSET offset}]
    [into_option]
    [FOR {UPDATE | SHARE}
        [OF tbl_name [, tbl_name] ...]
        [NOWAIT | SKIP LOCKED]
      | LOCK IN SHARE MODE]
    [into_option]

into_option: {
    INTO OUTFILE 'file_name'
        [CHARACTER SET charset_name]
        export_options
  | INTO DUMPFILE 'file_name'
  | INTO var_name [, var_name] ...
}

SELECT*
FROM employees
WHERE salary<58000;

SELECT*
FROM employees
WHERE emp_id=1;

SELECT*
FROM employees
WHERE dept_id=1 AND salary>45000;

SELECT*
FROM employees
WHERE salary>45000 OR dept_id='1' ;

SELECT*
FROM employees
WHERE emp_id BETWEEN 2 AND 4;

SELECT*
FROM employees
WHERE hire_date BETWEEN '2020-01-01' AND '2024-02-13';

SELECT*
FROM employees
ORDER BY salary DESC;

SELECT*
FROM employees
ORDER BY salary ASC

SELECT*
FROM employees
ORDER BY RAND();

SELECT*
FROM employees
LIMIT 3;

SELECT*
FROM employees
ORDER BY salary DESC
LIMIT 4;

UPDATE employees
SET salary='100000'
WHERE emp_id='1'

UPDATE employees
SET salary='150000',dept_id='5'
WHERE emp_id='2';

DELETE FROM employees 
WHERE emp_id='17'