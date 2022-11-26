FROM nginx:latest

LABEL version="0.0.1"
LABEL maintainer="michgboxy@gmail.com"

# UPDATE THE WORKING DIRECTORY
WORKDIR /usr/share/nginx/html

# Replace the index.html with custom file
COPY index.html index.html