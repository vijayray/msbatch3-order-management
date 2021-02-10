insert into SL_ORDERS values(10001, 'Frist Order', 10000)
insert into SL_ORDERS values(10002, '2nd Order', 20000)
insert into SL_ORDERS values(10003, '3rd Order', 30000)


insert into SL_ITEMS (ID, ORDER_ID, NAME, QUANTITY, PRICE, AMOUNT) values(1005, 10001, 'item1',5, 5000, 5000)
insert into SL_ITEMS (ID, ORDER_ID, NAME, QUANTITY, PRICE, AMOUNT) values(1002, 10001, 'item2',5, 5000, 5000)
insert into SL_ITEMS (ID, ORDER_ID, NAME, QUANTITY, PRICE, AMOUNT) values(1003, 10002, 'item3',10, 20000, 20000)
insert into SL_ITEMS (ID, ORDER_ID, NAME, QUANTITY, PRICE, AMOUNT) values(1004, 10003, 'item4', 20, 30000, 30000)