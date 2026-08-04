CREATE TABLE accounts (
                          id UUID PRIMARY KEY,
                          customer_name VARCHAR(100) NOT NULL,
                          created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE cards (
                       id UUID PRIMARY KEY,
                       account_id UUID REFERENCES accounts(id),
                       card_number VARCHAR(16) UNIQUE NOT NULL,
                       is_active BOOLEAN DEFAULT TRUE,
                       daily_limit DECIMAL(10, 2) NOT NULL,
                       created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE transactions (
                              id UUID PRIMARY KEY,
                              card_id UUID REFERENCES cards(id),
                              amount DECIMAL(10, 2) NOT NULL,
                              merchant VARCHAR(100) NOT NULL,
                              status VARCHAR(20) NOT NULL,
                              reason VARCHAR(255),
                              created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);