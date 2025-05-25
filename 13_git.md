# Module 13: Git

## Introduction to Version Control and Git

This module introduces version control concepts to simplify managing and rolling back code. You’ll learn how to distinguish between files and the tools used for version control. The focus then shifts to Git—understanding its purpose, installing it, and using it to create and clone repositories. The module concludes with a deep dive into Git’s commands and tools to enhance your coding workflow.

### Learning Outcomes

By the end of this module, you will be able to:  
- Differentiate between files and version control tools  
- Explain what Git is  
- Distinguish between a Git repository and Git commands  
- Install Git on Windows  
- Create a local Git repository  

# What is Git?

Git is the most widely used version control system. It tracks changes made to files, providing a history of modifications and allowing you to revert to specific versions when needed. Git also facilitates collaboration by enabling multiple people to merge their changes into a single source.

Whether you work solo or as part of a team, Git is a valuable tool for managing your code.

## Creating a Local Git Repository

1. **Create a Project Folder and Initialize Git:**
   - Make a folder for your project (e.g., `simple-GIT-demo`).
   - Inside it, run:
     ```bash
     cd simple-git-demo
     git init
     ```
   - `git init` creates a local Git repository by setting up necessary files.

2. **Check File Status:**
   - Create files inside the folder.
   - Use `git status` to see which files are untracked or ready for commit.

3. **Add Files to the Index (Staging Area):**
   - Use `git add <file>` or `git add -A` to stage files for commit.
   - This prepares files to be included in the next commit.

4. **Commit Changes:**
   - Use `git commit` or `git commit -m "message"` to save a snapshot of your staged changes.
   - Commits only include changes (deltas), not full copies of all files.
   - `git commit -a` commits all changes to tracked files at once (does not add new files).

5. **View Commit History:**
   - Use `git log` to see the history of commits.
   - Common options:
     - `git log -n <number>`: Limit number of commits shown.
     - `git log --oneline`: Show commits in a condensed form.
     - `git log --stat`: Show files changed and lines added/deleted.
     - `git log --graph --decorate --oneline`: Show a graphical commit history with branch/tag info.

Git log helps you explore project history, find specific changes, and understand code evolution.


