select * from `db_adriana`.`tbl_nomes`,
`db_senac`.`tbl_senac`
where `db_senac`.`tbl_senac`.`id`=
`db_adriana`.`tbl_nomes`.`id`
order by `db_senac`.`tbl_senactbl_senac`.`id`;