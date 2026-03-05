# Write your MySQL query statement below
-- SELECT article_id ASC FROM Views WHERE  COUNT(view_date>1);
SELECT DISTINCT author_id AS id
FROM views 
WHERE author_id=viewer_id
ORDER BY id ASC;