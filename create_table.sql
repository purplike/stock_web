CREATE TABLE Product (
     product_id NUMBER PRIMARY KEY,
     product_name VARCHAR2(255) NOT NULL,
     product_barcode VARCHAR2(100),
     stock_quantity NUMBER NOT NULL
);