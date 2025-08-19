CREATE TABLE IF NOT EXISTS Menu_Items(
 id SERIAL PRIMARY KEY,
 nome VARCHAR(100) NOT NULL,
 category VARCHAR(50) NOT NULL, -- Country or region
 description TEXT NOT NULL,
 price NUMERIC(10,2) NOT NULL
);