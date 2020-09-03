use aula10;

alter table pedido add column hora time;

update pedido set hora = '13:40' where num_pedido = 1;