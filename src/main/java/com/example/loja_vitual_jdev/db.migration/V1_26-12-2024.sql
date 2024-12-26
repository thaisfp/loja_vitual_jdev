select constraint_name from information_schema.constraint_column_usage 
where table_name = 'usuarios_acessos' and column_name = 'acesso_id'
and constraint_name <> 'unique_acesso_usuario';

alter table usuarios_acessos drop constraint "ukqs91qokws6i46m1vnsoakivh1";