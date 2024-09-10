select `db_adriana`.`cidade`.`nome`,
`db_adriana`.`estado`.`uf`
from `db_adriana`.`cidade`,
`db_adriana`.`estado`
where `db_adriana`.`cidade`.`nome` like '%Paulo%'
and `db_adriana`.`cidade`.`uf` =
`db_adriana`.`estado`.`id`;