CREATE TABLE `user` (
                         `id` integer AUTO_INCREMENT,
                         `social_id` varchar(100) NOT NULL,
                         `name` varchar(100) NOT NULL,
                         `created_date` timestamp NOT NULL,
                         `refresh_token` varchar(200) NOT NULL,
                         PRIMARY KEY (`id`),
);

CREATE TABLE `diary` (
                         `id` integer AUTO_INCREMENT,
                         `name` varchar(100) NOT NULL,
                         `title` varchar(100) NOT NULL,
                         `content` varchar(5000) NOT NULL,
                         PRIMARY KEY (`id`),
);