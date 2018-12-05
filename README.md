# QACaseStudy

ANSWERS:

Point-1:

Concerns/Doubts: 
1.	What are all the schema changes made as part of version 3/ If there are any changes?
2.	Does it support the lower version as well (backward compatibility)?
3.	What is the exact count for invalid logins before returning 403 Forbidden instead of 401 Unauthorized?
4.	What is the default timeout error (In case of huge response)?
5.	Any mocks (Drivers/Stubs) being used?

Approach: 
	To start with
1.	Basic Schema/Field level input validations and Database validation.
2.	Tests for Specifications such as Authorization (Security), Failed login limit, Pagination etc.
3.	Core Functionality/Business Logic
4.	Negative Test Cases
5.	Reliability tests (Rate limiting)
6.	LSPS (Load, Stress, Performance, Scalability) testing

Tests: 
Unit test, Adhok test, Load test, Peformance test, Functional test, Integration test, Regression test

Tools: [Java, Rest Assured, TestNG, Jenkins]/[JMeter, Ant, Jenkins]

Endpoint: https://api.github.com/ users/binnujesudasan/repos



Code available Locatin in GIT hub :-
https://github.com/Murali514609/CaseStudyPreparation/tree/master/CaseStudyPractice/src/test/java/CaseStudyPractice/CaseStudyPractice
https://github.com/Murali514609/CaseStudyPreparation/tree/master/CaseStudyPractice/src/test/java/CaseStudy/API/test


Loyalty Application Test cases info :-
https://github.com/Murali514609/CaseStudyPreparation/blob/master/CaseStudyForLoyaltyApplication.pdf
