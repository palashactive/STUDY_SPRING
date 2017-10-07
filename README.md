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
