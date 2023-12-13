create sequence IF NOT EXISTS SEQUENCE_ITEM start with 1 increment by 1;
DELETE from item;
CREATE TABLE IF NOT EXISTS item (
    id INT DEFAULT NEXTVAL('SEQUENCE_ITEM') PRIMARY KEY,
    name VARCHAR(100),
    price DECIMAL(10,2)
);

