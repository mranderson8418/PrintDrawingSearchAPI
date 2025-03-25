create table myusers
(
    id       bigint auto_increment
        primary key,
    name     varchar(255) not null,
    email    varchar(255) not null,
    password varchar(255) not null
);



CREATE TABLE IF NOT EXISTS printdrawings (
    id INT AUTO_INCREMENT PRIMARY KEY,
    bearing_max VARCHAR(255),
    bearing_min VARCHAR(255),
    customer VARCHAR(255),
    customer_pin VARCHAR(255),
    customer_revision VARCHAR(255),
    date VARCHAR(255),
    date_created VARCHAR(255),
    diameter_high FLOAT,
    diameter_low FLOAT,
    dmg_drawing_path VARCHAR(255),
    drawing_name VARCHAR(255),
    face_length_high FLOAT,
    face_length_low FLOAT,
    new_base_price VARCHAR(255),
    oem VARCHAR(255),
    originating_customer VARCHAR(255),
    part_no VARCHAR(255),
    pdf_path VARCHAR(255),
    prev_part_no VARCHAR(255),
    product_code VARCHAR(255),
    rev_number VARCHAR(255),
    scanned_path VARCHAR(255),
    steps VARCHAR(255),
    subcontractor VARCHAR(255),
    type VARCHAR(255),
    xlsm_path VARCHAR(255),
    xlsm_path VARCHAR(255)
    );
    
    
    