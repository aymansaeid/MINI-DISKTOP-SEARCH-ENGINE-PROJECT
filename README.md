# MINI-DISKTOP-SEARCH-ENGINE-PROJECT

📖 Introduction

This project is a Mini Desktop Search Engine developed in Java. It enables users to search through a collection of documents for specific keywords and provides a list of documents where the keywords are found. The project utilizes efficient data structures and algorithms to deliver fast and accurate results.

✨ Features

    🔍 Search through a collection of documents.

    🌳 Utilizes a Binary Search Tree (BST) for word and frequency storage.

    🖥️ Provides a Graphical User Interface (GUI) built with Java Swing.

    🔄 Supports post-order, pre-order, and in-order traversal of the BST.

    ✂️ Handles capitalization and punctuation effectively in input text.


🛠️ Implementation Details

  1. Data Structures
     
    Binary Search Tree (BST)
    
    Stores words along with their frequencies.
    
    Each node contains:
      Word
      Frequency
      A Linked List of filenames where the word appears.

    Linked List:
    Used within BST nodes to manage filenames and their respective frequencies efficiently
    
  2. Algorithm
     
    Read the files selected by the user.
  
    Split the content into words, ignoring:
  
      Common short words.
    
      HTML tags.
    
      Punctuation.
    
  Insert words into the BST, updating their frequency and linking the filenames where they occur.
  Search for specific words in the BST to display their frequency in each file.
  Use in-order, pre-order, and post-order traversal to view BST contents.

🎨 GUI Design

  The GUI, built with Java Swing, includes:

    File Selection: Choose one or more files to process.
  
    Ignore List Selection: Specify a list of words to ignore during processing.
  
    Traversal Options: Buttons for in-order, pre-order, and post-order traversal.
  
    Search Functionality: Enter keywords to find their occurrences in selected documents.

⚙️ Key Functions

  File and Ignore List Management

    ChooseFilesActionPerformed: Opens a file chooser dialog, processes selected files line by line, and inserts words into the BST.

    IgnoreFileActionPerformed: Allows users to upload an ignore list file for processing.

  Binary Search Tree Operations

    insert(T data, String fileName): Inserts a word into the BST with its associated filename and frequency.

    SearchForWordActionPerformed: Searches for a word in the BST and displays its occurrences.

  Traversal Methods

    postOrderButtonActionPerformed: Performs post-order traversal of the BST.

    inOrderButtonActionPerformed: Performs in-order traversal of the BST.

    preOrderButtonActionPerformed: Performs pre-order traversal of the BST.

📂 Code Overview

    AymanSaeidNode4Linklist: Represents a node in the linked list.

    AymanSaeidLinkList: Implements the linked list for managing filenames.

    AymanSaeidNode4BST: Represents a node in the binary search tree.

    JFrame Class: Provides the GUI and integrates BST operations.

🏁 Conclusion

  This project demonstrates the creation of a robust Mini Desktop Search Engine with efficient data processing and a user-friendly GUI. Future improvements could include:
  
    Performance optimization for larger document collections.
    
    Enhanced search features, such as phrase search or regular expression support.

📂 ScreeenShot

![sss1](https://github.com/user-attachments/assets/cb3e6a9d-7c28-4dba-866f-2709046bb4a8)

![sss2](https://github.com/user-attachments/assets/4ded0c60-99e4-4ebf-bd8b-8fb7f1332d07)

![sss3](https://github.com/user-attachments/assets/6e28a48d-0843-4503-9755-9e9af2568be9)

![sss4](https://github.com/user-attachments/assets/157b1019-cd34-4da0-82f4-5cb23de573e1)

![sss5](https://github.com/user-attachments/assets/8eb969ba-7681-435c-bfd0-e0ad02978fff)

![sss6](https://github.com/user-attachments/assets/ac12a110-6d3e-48d0-8abf-7a9605ae0592)

![sss7](https://github.com/user-attachments/assets/0b040c1d-aa77-4dfa-a379-3c144f704f12)

![sss8](https://github.com/user-attachments/assets/a206a46c-7ed8-49a7-90ee-05ef321f7401)

![sss9](https://github.com/user-attachments/assets/2c8abc41-923a-47c9-a7ea-ef6c599c9982)



