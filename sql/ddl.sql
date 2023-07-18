CREATE TABLE `user` (
                         `id` integer AUTO_INCREMENT,
                         `name` varchar(100) NOT NULL,
                         `created_date` timestamp NOT NULL,
                         CONSTRAINT USERS_PK PRIMARY KEY (`id`),
);

CREATE TABLE `diary` (
                         `id` integer AUTO_INCREMENT,
                         `social_id` varchar(100) NOT NULL,
                         `provider` enum('KAKAO', 'GOOGLE', 'APPLE') NOT NULL,
                         `name` varchar(20) NOT NULL,
                         `introduction` varchar(300),
                         `role` enum('USER', 'ADMIN') NOT NULL,
                         `created_date` timestamp NOT NULL,
                         `is_login` boolean NOT NULL,
                         `refresh_token` varchar(300),
                         `device_token` varchar(300),
                         `isIOS` boolean,
                         `isPremium` boolean,
                         `expiration_date` date,
                         CONSTRAINT USERS_PK PRIMARY KEY (`id`),
                         CONSTRAINT USERS_CK UNIQUE(`social_id`, `provider`)
);