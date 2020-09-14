I create an "observer" Class to add observers in the system at any time, and for sure I used the "IBlogObserver" 
and implement it in all the classes, so in the main, the user can add observers and posts, and when he added the 
Post all observers will have notifications about the post using "notifyObservers" method and "Posting" method
and save all these posts on the logger list.
