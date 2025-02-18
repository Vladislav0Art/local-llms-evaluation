import sys
import subprocess


# /bin/sh gradlew tga-runner:runCoverage --args="--benchmark /home/ubuntu/projects/tga-pipeline/artifacts/generation/augmented-prompt-full/test-generation-output/TestSpark/4/database-engine-8314bfdec0/benchmark.json --testSuite /home/ubuntu/projects/tga-pipeline/artifacts/generation/augmented-prompt-full/test-generation-output/TestSpark/4/database-engine-8314bfdec0/testSuite.json --output /home/ubuntu/projects/tga-pipeline/artifacts/generation/augmented-prompt-full/test-generation-output/TestSpark/4/database-engine-8314bfdec0/coverage-new.json"
dirpath = sys.argv[1]

command = ["/bin/sh", "gradlew", "tga-runner:runCoverage", f'--args="--benchmark {dirpath}/benchmark.json --testSuite {dirpath}/testSuite.json --output {dirpath}/coverage-new.json"']

print('Add JDK19 into PATH:\n', 'export "PATH=/home/ubuntu/.jdks/corretto-19.0.2/bin:$PATH"')

print(' '.join(command))

# process = subprocess.Popen(command, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
# # Get the output and error
# output, error = process.communicate()

# # Print the output
# if output:
#     print("Output:", output.decode())
# if error:
#     print("Error:", error.decode())
