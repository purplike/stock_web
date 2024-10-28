CREATE TABLE Product (
     product_id NUMBER PRIMARY KEY,
     product_name VARCHAR2(255) NOT NULL,
     product_barcode VARCHAR2(100),
     stock_quantity NUMBER NOT NULL
);

create sequence product_seq;

delete from product;

select * from product;


insert into product
values
    (
      product_seq.nextval
    , 'product 1'
    , '0001'
    , 0
    );

insert into product
values
    (
      product_seq.nextval
    , 'product 2'
    , '0002'
    , 0
    );