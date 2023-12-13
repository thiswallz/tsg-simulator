CREATE TABLE public.workflow_template_root (
    id int8 NOT NULL GENERATED BY DEFAULT AS IDENTITY (
        INCREMENT BY 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1 NO CYCLE
    ),
    name varchar (255) NULL,
    description varchar (1000) NULL,
    created timestamp NULL,
    creation_time timestamp NULL,
    CONSTRAINT workflow_template_root_pkey PRIMARY KEY (id)
);
