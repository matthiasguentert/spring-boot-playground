create table if not exists public.test (
    id serial primary key
);

create table if not exists public.foo (
  id serial primary key,
  name text,
  age int
);