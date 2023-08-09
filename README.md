1. Registration and Login:
As a user I should be able to login/Register in the movie booking application
Acceptance criteria:
1. A logged-in user can reset their password so they can login, even if they forget their password.
2. A logged-in user:
a. Cannot change their username.
b. Can logout from their account.
3. As a customer I should be able to furnish following details at the time of registration
a. First Name
b. Last Name
c. Email
d. Login Id
e. Password
f. Confirm Password
g. Contact Number
4. All details fields must be mandatory
5. Login Id and Email must be unique
6. Password and Confirm Password must be same
7. If any constraint is not satisfied, validation message must be shown

2. View &Search Movies:
As a user I should be able to view all the recent movies opened for booking. User can search any particular movies as well
Acceptance criteria:
a. User can view all the existing released movies.
b. User can search any particular movie based on the movie name

3. Book Tickets for a movie:

As a user I should be able to book tickets for a movie. Add this booking to a database table “Tickets”. Assign movie name and theatre name as a foreign key to database table “Movie” which is already created as a pre-requisite.

Acceptance criteria:
a. Book a movie ticket
b. Below are the details to be added
• Movie Name
• Theatre name
• Number of tickets
• Seat Number


4. View booked tickets and Update ticket status:

As an admin I should be able to view booked tickets and update the balance tickets available for a movie

Acceptance criteria:
a. View number of booked tickets for a particular movie from table “Tickets”
b. Check the tickets available from table “Movie” by calculating the total tickets booked
c. If the quantity is 0, update the ticket status as ‘SOLD OUT’, else update as ‘BOOK ASAP’