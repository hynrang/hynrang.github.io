# remove-tags.rb
module Jekyll
    module RemoveEmTagFilter
        def remove_h1_tag(input)
            input.gsub(/<h1>.*?<\/h1>/m, '')
        end
        
        def remove_em_tag(input)
            input.gsub(/<em>.*?<\/em>/m, '')
        end
    end
end

Liquid::Template.register_filter(Jekyll::RemoveEmTagFilter)