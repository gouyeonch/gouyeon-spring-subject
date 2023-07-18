CREATE TABLE `user` (
                         `id` integer AUTO_INCREMENT,
                         `name` varchar(100) NOT NULL,
                         `created_date` timestamp NOT NULL,
                         PRIMARY KEY (`id`),
);

CREATE TABLE `diary` (
                         `id` integer AUTO_INCREMENT,
                         `name` varchar(100) NOT NULL,
                         `title` varchar(100) NOT NULL,
                         `content` varchar(5000) NOT NULL,
                         PRIMARY KEY (`id`),
);