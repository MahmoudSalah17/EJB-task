INSERT INTO STUDENTS(NAME, ROLL_NUMBER, GENDER, DOB) VALUES
("Zaher", 1, 0, NOW()),
("Salah", 2, 0, NOW()),
("Mo'men", 3, 0, NOW()),
("Fawzi", 4, 0, NOW()),
("Mitchoz", 5, 0, NOW());


INSERT INTO ADDRESSES(COUNTRY, CITY, STREET_ADDRESS, STUDENT_ID) VALUES
("EGY", "Cairo", "1st", 1),
("EGY", "Alex", "10th", 1),
("USA", "NY", "3rd", 1),
("EGY", "Cairo", "2nd", 2),
("EGY", "Cairo", "3rd", 3),
("EGY", "Cairo", "4th", 4),
("EGY", "Cairo", "5th", 5);


INSERT INTO COURSES(NAME, HOURS) VALUES
("Java", 10),
("C++", 20),
("Python", 30),
("HTML", 40),
("CSS", 50),
("JavaScript", 60);

INSERT INTO STUDENT_COURSES(STUDENT_ID, COURSE_ID) VALUES
(1, 1),
(1, 2),
(1, 3),
(2, 1),
(3, 2),
(4, 3),
(5, 4),
(5, 6),
(4, 5),
(3, 4),
(2, 3);
