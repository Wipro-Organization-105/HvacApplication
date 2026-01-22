FROM mcr.microsoft.com/devcontainers/base:ubuntu-22.04

ARG USERNAME=developer
ARG USER_UID=1005
ARG USER_GID=$USER_UID

# Create a the usr and add sudo support
RUN apt-get update && apt-get install -y sudo \
    && groupadd --gid $USER_GID $USERNAME \
    && useradd --uid $USER_UID --gid $USER_GID -m $USERNAME \
    && echo $USERNAME ALL=\(ALL\) NOPASSWD:ALL > /etc/sudoers.d/$USERNAME \
    && chmod 0440 /etc/sudoers.d/$USERNAME
# Install AOSP build dependencies
RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
    && apt-get -y install --no-install-recommends \
        bison \
        curl \
        flex \
        g++-multilib \
        gcc-multilib \
        gnupg \
        gperf \
        lib32ncurses-dev \
        lib32readline-dev \
        lib32z1-dev \
        liblz4-tool \
        openjdk-11-jdk-headless \
        pngcrush \
        rsync \
        unzip \
        zip \
        zlib1g-dev \
    && apt-get clean && rm -rf /var/lib/apt/lists/*

# Set up repo tool
RUN mkdir -p /usr/local/bin && curl https://storage.googleapis.com/git-repo-downloads/repo > /usr/local/bin/repo && chmod a+x /usr/local/bin/repo


#Set the working directory
WORKDIR /workspace/aosp