CREATE TABLE IF NOT EXISTS `spring`.`contents` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) NOT NULL,
    `owner` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`)
);