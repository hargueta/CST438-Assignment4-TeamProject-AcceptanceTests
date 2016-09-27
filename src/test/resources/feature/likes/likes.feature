Feature: Likes
    As a user, I can get a list of movies that I like, so that I can select a movie to watch.

    Scenario Outline: Movies
        When a user with a unique email address <email> requests movies he/she likes
        Then the movie <movie> is returned

        Examples:
            | email              | movie            |
            | hargueta@csumb.edu | Django Unchained |
            | hargueta@csumb.edu | Interstellar     |
            | hargueta@csumb.edu | Ex Machina       |
            | ychino@csumb.edu   | Sisters          |
            | ychino@csumb.edu   | The Proposal     |
