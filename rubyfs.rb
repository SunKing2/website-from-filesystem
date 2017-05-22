def rfile(fname)
  f = File.new(fname, "r")
  f.each do |row|
    puts row
  end
end

sFiles = ['./partials/pre-head.html', './partials/head.html', './partials/body.html', './partials/post-body.html']
sFiles.each {|a| rfile(a)}
