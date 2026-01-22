FROM mcr.microsoft.com/devcontainers/base:ubuntu-22.04

# Install AOSP build dependencies
RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
    && apt-get -y install --no-install-recommends \
        bc \
        bison \
        build-essential \
        curl \
        flex \
        g++-multilib \
        gcc-multilib \
        gnupg \
        gperf \
        imagemagick \
        lib32ncurses-dev \
        lib32readline-dev \
        lib32z1-dev \
        liblz4-tool \
        libncurses5-dev \
        libsdl1.2-dev \
        libssl-dev \
        libxml2 \
        libxml2-utils \
        lzop \
        openjdk-11-jdk-headless \
        pngcrush \
        rsync \
        schedtool \
        unzip \
        x11proto-core-dev \
        xsltproc \
        zip \
        zlib1g-dev \
    && apt-get clean && rm -rf /var/lib/apt/lists/*

# Set up repo tool
RUN mkdir -p /usr/local/bin && curl https://storage.googleapis.com/git-repo-downloads/repo > /usr/local/bin/repo && chmod a+x /usr/local/bin/repo

#Set the working directory
#WORKDIR /workspace/aosp