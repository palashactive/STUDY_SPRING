# STUDY_SPRING

### Database Model

1. User Registration:-

Table :- USR_DETAILS

Attributes :- UserID, Firstname, Lastname, email, mobile, DOB, security_ques, security_ans, ProfilePic(References IMAGES)

Table :- IMAGES

Attributes :- ImageID, CreationTime, ImageData

Table :- CONNECTIONS

Attributes :- ConnID, userid1(References USR_DETAILS), userid2, creationDate

Table :- CONNNECTION_REQUEST

Attributes :- reqID, userid1(References USR_DETAILS), userid2, message

Table :- POSTS

Attributes :- POstID, UserID, Time, Message, ImageID(References IMAGES)

Table :- COMMENTS

Attributes :- CommentID, PostID(References POSTS), message, UserID(References USR_DETAILS)

###CREATE QUERIES

create table user_details (userID varchar(50) primary key, passcode varchar(10), firstname varchar(50), lastname varchar(50), DOB date,email varchar(50),
                    phone integer) ;
                    
create table images (imageID varchar(50) primary key, creationTime timestamp, imageData bytea) ;

create table connections (connID varchar(50) primary key, userID1 varchar(10) references user_details(userId),
                          userID2 varchar(10) references user_details(userId), creationTime timestamp );
                          
create table connection_req (requestID varchar(50) primary key, userID1 varchar(10) references user_details(userId),
                          userID2 varchar(10) references user_details(userId), message varchar(200) );       
                          
create table posts (postID varchar(50) primary key, userID varchar(10) references user_details(userId),
                           imageID varchar(50) references images(imageid), creationTime timestamp , message varchar(200));
                          
create table user_comments (commentID varchar(50) primary key, postID varchar(10) references posts(postID),
                          userID varchar(10) references user_details(userId), message varchar(200), creationTime timestamp );  