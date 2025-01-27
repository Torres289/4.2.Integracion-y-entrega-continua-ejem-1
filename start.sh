#!/bin/bash
cd ~/actions-runner
./config.sh --disableupdate --url https://github.com/${REPO} --token ${TOKEN} --labels ${LABELS}

cleanup() {
    echo "Removing runner..."
    ./config.sh remove --unattended --token ${TOKEN}
}

trap 'cleanup; exit 130' INT
trap 'cleanup; exit 143' TERM
./run.sh & wait $!