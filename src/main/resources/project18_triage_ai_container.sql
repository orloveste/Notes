create schema triage;
create table triage.welcome_DGPR
(
    idPatient int(10) unsigned auto_increment primary key ,
    accept boolean
);
insert into triage.welcome_DGPR(accept) value (true);
insert into triage.welcome_DGPR(accept) value (true);
insert into triage.welcome_DGPR(accept) value (true);
insert into triage.welcome_DGPR(accept) value (false);
insert into triage.welcome_DGPR(accept) value (true);

create table triage.patient_Weight
(
    idPatient int unsigned primary key ,
    patientWeight int(3) unsigned,
    foreign key (idPatient) references triage.welcome_DGPR(idPatient)
);
insert into triage.patient_Weight(idPatient, patientWeight)values (1, 140);
insert into triage.patient_Weight(idPatient, patientWeight)values (2, 33);
insert into triage.patient_Weight(idPatient, patientWeight)values (3, 44);
insert into triage.patient_Weight(idPatient, patientWeight)values (4, 78);
insert into triage.patient_Weight(idPatient, patientWeight)values (5, 110);

create table  triage.patient_Height
(
    idPatient int unsigned primary key ,
    height int(4) unsigned,
    foreign key (idPatient) references triage.patient_Weight (idPatient)
);
insert into triage.patient_Height(idPatient, height)values (1, 156);
insert into triage.patient_Height(idPatient, height)values (2, 192);
insert into triage.patient_Height(idPatient, height)values (3, 174);
insert into triage.patient_Height(idPatient, height)values (4, 159);
insert into triage.patient_Height(idPatient, height)values (5, 190);

create table triage.temperature_IR
(
    idPatient int unsigned primary key,
    entryTemperature float(3) not null,
    secondTemperatureCheck float(3) not null,
    thirdTemperatureCheck float(3) not null,
    foreign key (idPatient) references triage.patient_Height(idPatient)
);
insert into triage.temperature_ir(idPatient, entryTemperature, secondTemperatureCheck, thirdTemperatureCheck) VALUES (1, 39, 36, 37);
insert into triage.temperature_ir(idPatient, entryTemperature, secondTemperatureCheck, thirdTemperatureCheck) VALUES (2, 49, 46, 17);
insert into triage.temperature_ir(idPatient, entryTemperature, secondTemperatureCheck, thirdTemperatureCheck) VALUES (3, 29, 36, 37);
insert into triage.temperature_ir(idPatient, entryTemperature, secondTemperatureCheck, thirdTemperatureCheck) VALUES (4, 19, 06, 27);
insert into triage.temperature_ir(idPatient, entryTemperature, secondTemperatureCheck, thirdTemperatureCheck) VALUES (5, 129, 316, 327);

create table triage.id_check
(
    idPatient int unsigned primary key,
    personal_identification_code int(13) unsigned,
    first_name varchar(25) not null ,
    last_name varchar(25) not null,
    place_of_birth varchar(25) not null,
    date_of_birth date,
    current_address varchar(35) not null,
    validityId boolean,
    insurence_code int(20) unsigned,
    foreign key (idPatient) references  triage.temperature_ir(idPatient)
);
insert into triage.id_check(idPatient, first_name, last_name, place_of_birth, current_address, validityId, insurence_code)
VALUES (1,'Ruby','Gulliany','Kazahstan','Slovenia, Ubjei ulitze 5',true, 0988);
insert into  triage.id_check(idPatient, personal_identification_code, first_name, last_name, place_of_birth, date_of_birth, current_address, validityId, insurence_code)
VALUES (2,20202092,'Bibi','Vijelie', 'Copacei de munte', 20011220,'LA',true, 89898);
insert into  triage.id_check(idPatient, personal_identification_code, first_name, last_name, place_of_birth, date_of_birth, current_address, validityId, insurence_code)
VALUES (3,082,'Rosa','Killi', 'Rowanda', 19840312,'Viena',true, 43534);
insert into  triage.id_check(idPatient, personal_identification_code, first_name, last_name, place_of_birth, date_of_birth, current_address, validityId, insurence_code)
VALUES (4,24324,'Muza','Kirck', 'Cocieri', 19891201,'NY',true, 3545);
insert into  triage.id_check(idPatient, personal_identification_code, first_name, last_name, place_of_birth, date_of_birth, current_address, validityId, insurence_code)
VALUES (5,5352,'Roby','Wiliams', 'Roma', 19560126,'Paris',true, 354);

create table triage.high_risk
(
    idPatient int unsigned,
    patient_weight boolean,
    patient_height boolean,
    patient_temperature boolean,
    age boolean,
    foreign key (idPatient) references triage.id_check(idPatient)
);
insert into triage.high_risk (idPatient, patient_weight, patient_height, patient_temperature, age)
    value (1, true, true,true,true);
insert into triage.high_risk (idPatient, patient_weight, patient_height, patient_temperature, age)
    value (3, true, true,true,false);
insert into triage.high_risk (idPatient, patient_weight, patient_height, patient_temperature, age)
    value (5, true, true,true,true);

create table triage.low_risk
(
    idPatient int unsigned,
    patient_weight boolean,
    patient_height boolean,
    patient_temperature boolean,
    age int(3) unsigned,
    foreign key (idPatient) references triage.id_check(idPatient)
);
insert into triage.low_risk (idPatient, patient_weight, patient_height, patient_temperature, age)
    value (2, false, false,true,false);
insert into triage.low_risk (idPatient, patient_weight, patient_height, patient_temperature, age)
    value (4, false, true,true,false);
