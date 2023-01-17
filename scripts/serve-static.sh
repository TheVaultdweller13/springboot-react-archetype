#!/bin/bash

# Clean static resources
rm -rf ../backend/src/main/resources/static/*
echo "-- Clean static resources folder --"

# Move build folder to resources/static
mkdir -p ../backend/src/main/resources/static && mv build/* ../backend/src/main/resources/static
echo "-- Move build to resources/static --"

# Clean build folder
rm -rf build
echo "-- Clean build folder --"