CREATE TABLE `Parkings`
(
    `ID`          bigint(20)     NOT NULL AUTO_INCREMENT,
    `NAME`        varchar(255)   NOT NULL,
    `LAT`         decimal(10, 0) NOT NULL,
    `LNG`         decimal(10, 0) NOT NULL,
    `COUNTRY`     varchar(255)   NOT NULL,
    `STREET`      varchar(255)   NOT NULL,
    `CREATE_DATE` timestamp      NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `POSTAL_CODE` varchar(10)    NOT NULL,
    PRIMARY KEY (`id`)
);
