CREATE TABLE IF NOT EXISTS orders_products (
    order_id BIG_INT,
    product_id BIG_INT,
    PRIMARY KEY (order_id, prodcut_id),
    FOREIGN KEY (order_id) REFERENCES orders(id),
    FOREIGN KEY (product_id) REFERENCES products(id)
)