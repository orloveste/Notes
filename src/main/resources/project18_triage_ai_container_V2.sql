create schema triage;
create table triage.entry
(
    idAccept_DGPR int unsigned auto_increment primary key,
    accept_DGPR boolean
);

create table triage.patient
(
    idPatient int unsigned auto_increment primary key,
    idAccept_DGPR int unsigned,
    foreign key (idAccept_DGPR) references triage.entry(idAccept_DGPR)
);

create table triage.weight
(
    idWeight int unsigned auto_increment primary key,
    patientWeight int unsigned,
    idPatient int unsigned,
    foreign key (idPatient) references triage.patient(idPatient)
);

create table  triage.height
(
    idHeight int unsigned auto_increment primary key,
    height int unsigned,
    idPatient int unsigned,
    foreign key (idPatient) references triage.patient(idPatient)
);

create table triage.temperature
(
    idTemperature int unsigned auto_increment primary key,
    entry_temperature_check float unsigned,
    half_temperature_check float unsigned,
    final_temperature_check float unsigned,
    idPatient int unsigned,
    foreign key (idPatient) references triage.patient(idPatient)
);

create table triage.personal_data
(
    idPersonal_data int unsigned auto_increment primary key,
    personal_identification_code int unsigned,
    first_name varchar (25) not null,
    last_name varchar(25) not null,
    place_of_birth varchar(25) not null,
    date_of_birth date,
    current_address varchar(35) not null,
    validityId boolean,
    insurence_code int unsigned,
    idPatient int unsigned,
    foreign key (idPatient) references triage.patient(idPatient)
);

create table triage.high_risk
(
    idHighRisk int unsigned auto_increment primary key,
    riskValue int unsigned,
    idHeight int unsigned,
    idWeight int unsigned,
    idTemperature int unsigned,
    idPersonal_data int unsigned,
    idPatient int unsigned,
    foreign key (idHeight) references triage.height(idHeight),
    foreign key (idWeight) references triage.weight(idWeight),
    foreign key (idTemperature) references triage.temperature(idTemperature),
    foreign key (idPersonal_data) references triage.personal_data(idPersonal_data),
    foreign key (idPatient) references triage.patient(idPatient)
);

create table triage.low_risk
(
    idLowRisk int unsigned auto_increment primary key,
    riskValue int unsigned,
    idHeight int unsigned,
    idWeight int unsigned,
    idTemperature int unsigned,
    idPersonal_data int unsigned,
    idPatient int unsigned,
    foreign key (idHeight) references triage.height(idHeight),
    foreign key (idWeight) references triage.weight(idWeight),
    foreign key (idTemperature) references triage.temperature(idTemperature),
    foreign key (idPersonal_data) references triage.personal_data(idPersonal_data),
    foreign key (idPatient) references triage.patient(idPatient)
);

insert into triage.entry(accept_DGPR)
values (true), (true), (true), (false), (true),
       (true), (true), (true), (false), (true);
insert into triage.patient(idAccept_DGPR)
values (1), (2), (3), (5),
       (6), (7), (8), (10);
insert into triage.weight(patientWeight, idPatient)
values (101, 1), (89,2),(29, 3),
       (89,4), (38, 5), (65, 6),
       (49, 7), (93, 8);
insert into triage.height(height, idPatient)
values (101, 1), (189,2), (129, 3),
       (189,4), (138, 5), (165, 6),
       (149, 7), (193, 8);
insert into triage.temperature(entry_temperature_check, half_temperature_check, final_temperature_check, idPatient)
VALUES (39.3, 39, 36.7, 1),
       (38.3, 39.2, 40, 2),
       (38.2, 39.3, 40.7, 3),
       (38.1, 39.1, 40.2, 4),
       (39.9, 39.9, 36.8, 5),
       (39.4, 39, 36.9, 6),
       (45.1, 39.2, 36.6, 7),
       (39.9, 39.1, 36.7, 8);
insert into triage.personal_data(personal_identification_code, first_name, last_name, place_of_birth, date_of_birth, current_address, validityId, insurence_code, idPatient)
VALUES (2379078713232,'Ruby','Gulliany','Kazahstan',19871210,'Slovenia, Ubjei ulitze 5',true, 0988, 1),
       (238718734,'Jan', 'De-La-Coada-Vacii', 'Undeva Departe', 20001201, 'Sus pe strada nr.2', true, 9009938, 2),
       (8271837,'Jonny','Drago','Bibilica Veche',19991103, 'Copacei de munte', true,364748,3),
       (7218947,'Scuzi', 'Lambada', 'Jovvanni Buri', 20010523, 'Joja West', true, 848475, 4),
       (87214,'Ruy','Guany','Kazahstan',191210,'Bulai, Ubjei ulit 4',true, 64646, 5),
       (832486321,'Janse', 'Deacii', 'Undeva Departe', 20001201, 'Susschi str nr.2', true, 9045, 6),
       (372487123,'Joy','Dgo','Bibilche',191103, 'Copaunte', true,36454,7),
       (7482843,'Scuzdedi', 'Lamda', 'Jovvuri', 200103, 'Joja West', true, 8445475, 8);
insert into triage.high_risk (riskValue)
values (10), (8), (7), (9);
insert into triage.low_risk (riskValue)
values (1), (5), (2), (0);
