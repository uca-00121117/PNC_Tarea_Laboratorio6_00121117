-- Database: PNC_L6

drop table public.contribuyente
Create Table public.contribuyente(
	c_contribuyente serial ,
	c_importancia integer,
	s_nombre varchar(30),
	s_apellido varchar(30),
	s_nit varchar(14),
	f_fecha_ingreso date,
	constraint pk_contribuyente primary key(c_contribuyente),
	constraint fk_contribuyente_importancia foreign key(c_importancia)
	references public.importancia(
		c_importancia) on delete restrict on update cascade
)
drop table public.importancia
Create table public.importancia(
	c_importancia serial ,
	s_importancia varchar(30),
	constraint pk_importancia primary key(c_importancia)
)
insert into public.importancia(c_importancia,s_importancia)
values(1,'Grandes')
insert into public.importancia(c_importancia,s_importancia)
values(2,'Medianos')
insert into public.importancia(c_importancia,s_importancia)
values(3,'Otros')


SELECT * FROM public.importancia;
SELECT * FROM public.contribuyente;